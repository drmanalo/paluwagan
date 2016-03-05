package com.manalo.presenter;

import com.manalo.entity.Miembro;
import com.manalo.service.MiembroService;
import com.vaadin.annotations.Theme;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;

@SpringUI
@Theme("valo")
public class VaadinUI extends UI {

    @Autowired
    private MiembroService miembroService;

    final Grid miembroGrid = new Grid();

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        final VerticalLayout layout = new VerticalLayout();
        layout.setSpacing(true);
        layout.setMargin(true);
        setContent(layout);

        final Label heading = new Label("Mga Miembro");
        heading.setStyleName(ValoTheme.LABEL_H1);

        buildGrid();
        action();

        layout.addComponent(heading);
        layout.addComponent(miembroGrid);
    }

    private void buildGrid() {

        miembroGrid.setWidth(800, Unit.PIXELS);
        miembroGrid.setSelectionMode(Grid.SelectionMode.SINGLE);
        miembroGrid.setColumns("id", "pangalan", "apelyido", "username", "dateModified", "modifiedBy");
        miembroGrid.getColumn("dateModified").setHeaderCaption("Nabago");
        miembroGrid.getColumn("modifiedBy").setHeaderCaption("Binago Ni");

        miembroGrid.setContainerDataSource(new BeanItemContainer<>(Miembro.class, miembroService.findAll()));

        miembroGrid.setEditorEnabled(true);
        miembroGrid.setFrozenColumnCount(0);
        miembroGrid.getColumn("id").setEditable(false);
        miembroGrid.getColumn("username").setEditable(false);
        miembroGrid.getColumn("dateModified").setEditable(false);
        miembroGrid.getColumn("modifiedBy").setEditable(false);
    }

    private void action() {

        miembroGrid.getEditorFieldGroup().addCommitHandler(new FieldGroup.CommitHandler() {

            @Override
            public void preCommit(FieldGroup.CommitEvent commitEvent) throws FieldGroup.CommitException {

                Field<?> field = miembroGrid.getColumn("pangalan").getEditorField();
                field.setRequired(true);
                field.setRequiredError("kailangan may pangalan");

                field = miembroGrid.getColumn("apelyido").getEditorField();
                field.setRequired(true);
                field.setRequiredError("kailangan may apelyido");
            }

            @Override
            public void postCommit(FieldGroup.CommitEvent commitEvent) throws FieldGroup.CommitException {

                Miembro miembro = (Miembro) miembroGrid.getSelectedRow();
                //miembroService.save(miembro);
                Notification.show(miembro.toString());

            }
        });

    }

    private void refreshGrid(String filter) {
        miembroGrid.setContainerDataSource(new BeanItemContainer<>(Miembro.class, miembroService.findByApelyidoStartingWith(filter)));
    }
}
