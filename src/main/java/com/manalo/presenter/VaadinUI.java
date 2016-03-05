package com.manalo.presenter;

import com.manalo.entity.Miembro;
import com.manalo.service.MiembroService;
import com.vaadin.annotations.Theme;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
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

        layout.addComponent(heading);
        layout.addComponent(miembroGrid);
    }

    private void buildGrid() {
        miembroGrid.setSelectionMode(Grid.SelectionMode.SINGLE);
        miembroGrid.setColumns("id", "pangalan", "apelyido", "username", "modifiedDate", "modifiedBy");
        miembroGrid.setContainerDataSource(new BeanItemContainer<>(Miembro.class, miembroService.findAll()));
    }

    private void refreshGrid(String filter) {
        miembroGrid.setContainerDataSource(new BeanItemContainer<>(Miembro.class, miembroService.findByApelyidoStartingWith(filter)));
    }
}
