package com.etesc.tasksandtasks.api.dto.request;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRequestDTO(
		@NotBlank
		String name,
		@NotBlank
		@Email
		String email) {
}
