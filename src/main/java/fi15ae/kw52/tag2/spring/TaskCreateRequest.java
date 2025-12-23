package fi15ae.kw52.tag2.spring;

import jakarta.validation.constraints.NotBlank;

public record TaskCreateRequest(@NotBlank String title) {
}
