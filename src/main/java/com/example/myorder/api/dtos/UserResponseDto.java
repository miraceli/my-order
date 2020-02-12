package com.example.myorder.api.dtos;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

public class UserResponseDto {

    @NotEmpty
    @ApiModelProperty(value = "$(User.create.id=ID do Usuário")
    private String id;

    @NotEmpty
    @ApiModelProperty(value = "$(User.create.name=Nome")
    private String name;

    @NotEmpty
    @ApiModelProperty(value = "$(User.create.email=Email")
    private String email;

    @NotEmpty
    @ApiModelProperty(value = "$(User.create.phone=Telefone")
    private String phone;

    @NotEmpty
    @ApiModelProperty(value = "$(User.create.address=Endereço")
    private String address;



}
