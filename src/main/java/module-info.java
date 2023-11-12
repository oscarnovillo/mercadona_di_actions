module Mercadona {

    requires jakarta.inject;
    requires jakarta.cdi;
    requires io.vavr;
    requires com.google.gson;
    requires lombok;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.dataformat.yaml;
    requires org.apache.logging.log4j;


    opens ui.common;
    opens common;
    opens config;
    opens data.bd;
    opens modelo.common;

    exports ui;
    exports di;
    exports ui.client_actions;
    exports ui.client_account;
    exports config;
    exports data.impl;
    exports servicios.impl;


}
