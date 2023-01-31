package org.zerock.api01.todo.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class TodoDTO {

    @JsonProperty("id")
    private Long tno;

    private String title;

}
