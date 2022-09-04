package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.StudentDashboardSnapshotInfo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbStudentDashboardSnapshotInfoMarshaller {

    public static void main(String[] args) {

    }

    public static void jaxbObjectToXMl(StudentDashboardSnapshotInfo studentDashboardSnapshotInfo) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(StudentDashboardSnapshotInfo.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(studentDashboardSnapshotInfo, new File("studentdashboardsnapshotinfo.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
