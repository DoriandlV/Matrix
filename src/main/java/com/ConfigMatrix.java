package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class ConfigMatrix {

    @Value("${matrix.row}")
    private int row;
    @Value("${matrix.column}")
    private int column;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }


}
