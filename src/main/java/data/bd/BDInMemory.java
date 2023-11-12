package data.bd;

import data.DaoProducts;
import data.impl.DaoProductsImpl;
import modelo.*;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BDInMemory {

    private BDInMemory() {
    }

    public static final Map<String, Client> clientes = new LinkedHashMap<>();
    public static final ArrayList<Product> inventario = new ArrayList<>();

    static {

        clientes.put("123", new ClientNormal("123", "Javier"));

        clientes.put("124", new ClientNormal("Francisco","124"));
        clientes.put("125", new ClientNormal("lucas","125"));

        inventario.add(new ProductNormal("LACASITOS", 12, 11, List.of(new Ingredient("CACAO"))));
        inventario.add(new ProductNormal("HARINA", 25, 100, List.of(new Ingredient("HARINA"))));
        inventario.add(new ProductNormal("HIERBA BUENA", 1.3, 10, List.of(new Ingredient("HIERBA BUENA"))));
        inventario.add(new ProductNormal("CHOCOLATE", 2.5, 15, List.of(new Ingredient("CACAO"))));
        inventario.add(new ProductNormal("AVION TELEDIRIGIDO", 20.5, 15, new ArrayList<>()));
        


    }

}
