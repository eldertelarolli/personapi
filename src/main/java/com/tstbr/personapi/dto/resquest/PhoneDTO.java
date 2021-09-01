package com.tstbr.personapi.dto.resquest;


import com.tstbr.personapi.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;

//api validation
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @NotEmpty
    @Size(min = 13 , max = 14)
    private String number;
}
