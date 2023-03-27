package com.yuhen.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Menu implements Serializable {
    private Long id;

    private String pattern;

    private List<Role> roleList;

    private static final long serialVersionUID = 1L;
}