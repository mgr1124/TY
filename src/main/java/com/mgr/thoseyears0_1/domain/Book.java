package com.mgr.thoseyears0_1.domain;

import lombok.Data;

//lombok
@Data
public class Book extends Commodity{
    private Integer id;
    private String type;
    private String name;
    private String description;
}
