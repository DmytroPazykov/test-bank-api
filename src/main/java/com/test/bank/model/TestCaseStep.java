package com.test.bank.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class TestCaseStep {

    @Id
    @ApiModelProperty(hidden = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @ApiModelProperty(hidden = true)
    long testCaseId;
    @ApiModelProperty(example = "Click button")
    String step;
}
