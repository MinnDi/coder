package ru.croc.coder.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Teacher")
public class Teacher extends User{
}
