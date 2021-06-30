package com.srjons.springbootjpa.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.srjons.springbootjpa.model.Exam;
import com.srjons.springbootjpa.model.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomPersonListSerializer extends StdSerializer<List<Person>> {

    public CustomPersonListSerializer() {
        this(null);
    }

    protected CustomPersonListSerializer(Class<List<Person>> t) {
        super(t);
    }

    @Override
    public void serialize(List<Person> personList, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException {
        List<Integer> ids = new ArrayList<>();
        for (Person person: personList) {
            ids.add(person.getId());
        }
        jsonGenerator.writeObject(ids);
    }
}
