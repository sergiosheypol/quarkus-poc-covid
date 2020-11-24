package com.shpl.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    @With
    private Integer id;

    private String name;

    private String surname;

    @With
    private Boolean positive;
}
