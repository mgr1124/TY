package com.mgr.thoseyears0_1.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//lombok
@Component
@Data
@ConfigurationProperties(prefix = "testcase.book")
public class BookCase extends Commodity{
    private Integer id;
    private String type;
    private String name;
    private String description;
}
