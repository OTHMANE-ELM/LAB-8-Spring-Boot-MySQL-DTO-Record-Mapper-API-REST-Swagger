package ma.fst.othamane.dto;

public record StudentResponseDTO(
        Long id,
        String firstName,
        String lastName,
        String email,
        String major,
        Integer age
) {
}