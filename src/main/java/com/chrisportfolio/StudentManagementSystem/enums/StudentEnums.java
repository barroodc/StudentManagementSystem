package com.chrisportfolio.StudentManagementSystem.enums;

public enum StudentEnums {

    BROWN_CHARLIE(17365429L),
    VAN_PELT_LUCY(38688296L);

    private final Long studentIDValue;

    StudentEnums(Long studentIDValue) {
        this.studentIDValue = studentIDValue;
    }

    public Long getStudentIDValue() {
        return studentIDValue;
    }
}
