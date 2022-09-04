package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.StudentDashboardSnapshotInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbStudentDashboardSnapshotInfoMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbStudentDashboardSnapshotInfoMarshaller.class);

    public static void main(String[] args) {

    }

    public static void jaxbObjectToXMl(StudentDashboardSnapshotInfo studentDashboardSnapshotInfo) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(StudentDashboardSnapshotInfo.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(studentDashboardSnapshotInfo, new File("studentdashboardsnapshotinfo.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}
