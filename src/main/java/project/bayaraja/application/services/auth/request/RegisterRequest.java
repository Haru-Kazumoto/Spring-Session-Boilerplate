package project.bayaraja.application.services.auth.request;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;
import project.bayaraja.application.enums.Roles;
import project.bayaraja.application.services.students.request.StudentCreateDto;

@Getter @Setter @AllArgsConstructor
@NoArgsConstructor @Builder
public class RegisterRequest {

    @NotEmpty() @NotNull()
    private String username;

    @NotEmpty() @NotNull()
    private String password;

    @Nullable
    private MultipartFile profile_picture;

    @NotNull()
    private Roles role;

    @Nullable()
    private StudentCreateDto student;

}
