package org.zerock.api01.todo.service;

import org.zerock.api01.common.dto.PageRequestDTO;
import org.zerock.api01.common.dto.PageResponseDTO;
import org.zerock.api01.todo.dto.TodoDTO;

public interface TodoService {

    PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);

}
