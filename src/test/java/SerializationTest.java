import com.google.gson.Gson;
import model.Child;
import model.Parent;
import model.Person;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Date;

public class SerializationTest {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bOutput = new ByteArrayOutputStream(512);
        int type = 0;
        Gson gson = new Gson();
        byte[] bytes = null;

        Person person = null;
        byte[] personInBytes = null;

        person = new Parent(1, "Peter", "IT", 1);
//        personInBytes = SerializationUtils.serialize(person);
//        person = SerializationUtils.deserialize(personInBytes);
//        PrintPerson(person);

        person = getPerson(getBytes(person));
        PrintPerson(person);

        person = new Child(2, "Peter", new Date());
//        personInBytes = SerializationUtils.serialize(person);
//        person = SerializationUtils.deserialize(personInBytes);
//        PrintPerson(person);

        person = getPerson(getBytes(person));
        PrintPerson(person);


//        ByteArrayOutputStream bOutput = new ByteArrayOutputStream(1024);
//
//        int type = 2;
//        bOutput.write(type);
//        bOutput.write(personInBytes);
//
//        byte[] bytes = bOutput.toByteArray();
//        type = bytes[0];
//        System.out.println(type);
//        System.out.println(bytes.length);
//
//        byte[] slice = Arrays.copyOfRange(bytes, 1, bytes.length);
//        person = (Person) SerializationUtils.deserialize(slice);
//        System.out.println(person.getId());
//
//        System.out.println("Done");
    }

    private static void PrintPerson(Object object) {
        if (object instanceof Child) {
            Child child = (Child) object;
            System.out.println("Child.Id=" + child.getId());
            System.out.println("Child.DateOfBirth=" + child.getDateOfBirth());
        } else if (object instanceof Parent) {
            Parent parent = (Parent) object;
            System.out.println("Parent.Id="+parent.getId());
            System.out.println("Parent.Occupation="+parent.getOccupation());
        } else if (object instanceof Person) {
            Person person = (Person) object;
            System.out.println("PersonId="+person.getId());
            System.out.println("PersonId="+person.getName());
        }
    }

    private static byte[] getBytes(Object object) throws IOException {
        int type = -1;
        Gson gson = new Gson();
        byte[] bytes = null;
        ByteArrayOutputStream bOutput = new ByteArrayOutputStream(512);

        if (object instanceof Parent) {
            type = 1;
        } else if (object instanceof Child) {
            type = 2;
        } else if (object instanceof Person) {
            type = 0;
        }

        bOutput.write(type);
        bOutput.write(gson.toJson(object).getBytes(Charset.forName("UTF-8")));
        return bOutput.toByteArray();
    }

    private static Person getPerson(byte[] bytes) {
        int type = bytes[0];
        byte[] slice = Arrays.copyOfRange(bytes, 1, bytes.length);

        Gson gson = new Gson();

        Person person = null;
        if (type == 0) {
            return gson.fromJson(new String(slice), Person.class);
        } else if (type == 1) {
            return gson.fromJson(new String(slice), Parent.class);
        } else if (type == 2) {
            return gson.fromJson(new String(slice), Child.class);
        }
        return person;
    }
}
