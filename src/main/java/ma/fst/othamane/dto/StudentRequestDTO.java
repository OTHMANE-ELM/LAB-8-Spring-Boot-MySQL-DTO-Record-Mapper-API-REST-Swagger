package ma.fst.othamane.dto;

import jakarta.validation.constraints.*;

public record StudentRequestDTO(

        @NotBlank(message = "Le prénom est un champ indispensable et ne saurait être omis")
        String firstName,

        @NotBlank(message = "Le nom de famille est requis et ne peut demeurer vide")
        String lastName,

        @NotBlank(message = "L'adresse électronique est obligatoire et ne peut être laissée vide")
        @Email(message = "L'adresse électronique renseignée ne respecte pas un format valide")
        String email,

        @NotBlank(message = "La filière d'appartenance est requise et ne peut être indéterminée")
        String major,

        @NotNull(message = "L'âge de l'étudiant est une donnée indispensable qui ne peut être absente")
        @Min(value = 17, message = "L'âge renseigné est en deçà du seuil minimal autorisé, fixé à 17 ans")
        @Max(value = 100, message = "L'âge renseigné excède la limite maximale admise, établie à 100 ans")
        Integer age
) {
}