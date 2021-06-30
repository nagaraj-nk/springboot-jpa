package com.srjons.springbootjpa.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.srjons.springbootjpa.model.Exam;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomExamListSerializer extends StdSerializer<List<Exam>> {

    public CustomExamListSerializer() {
        this(null);
    }

    protected CustomExamListSerializer(Class<List<Exam>> t) {
        super(t);
    }

    @Override
    public void serialize(List<Exam> exams, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException {
        List<Integer> ids = new ArrayList<>();
        for (Exam exam: exams) {
            ids.add(exam.getId());
        }
        jsonGenerator.writeObject(ids);
    }
}
