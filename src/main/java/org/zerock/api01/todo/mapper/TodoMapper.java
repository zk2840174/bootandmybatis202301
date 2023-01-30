package org.zerock.api01.todo.mapper;

import org.zerock.api01.common.dto.PageRequestDTO;
import org.zerock.api01.todo.dto.TodoDTO;

import java.util.List;

public interface TodoMapper {

    List<TodoDTO> list(PageRequestDTO pageRequestDTO);

}
