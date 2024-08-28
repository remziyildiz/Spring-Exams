package com.haydikodlayalim;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Benim Pet Nesnem", description = "Benim Pet")

public class Pet {
    @ApiModelProperty(value = "Pet nesnesinin tekil Id alani")
    private int id;
    @ApiModelProperty(value = "Pet nesnesinin Adi alani")
    private  String name;
    @ApiModelProperty(value = "Pet nesnesinin Tarih alani")
    private Date date;
}
