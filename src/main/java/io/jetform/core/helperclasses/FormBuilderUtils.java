package io.jetform.core.helperclasses;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import io.jetform.core.annotation.FormElement;
import io.jetform.core.annotation.model.Validation;


public class FormBuilderUtils {

	public static List<Validation> getValidations(FormElement formField){
		
		List<Validation> collect = Arrays.stream(formField.validations())
		      .map(validation -> new Validation(validation.type().name(), validation.value()))
		      .collect(Collectors.toList());
		return collect;
	}

	static String createLabel(String label) {

		String[] words = label.split("(?=\\p{Upper})");
		StringBuilder stringBuilder = new StringBuilder();

		for (String str : words)
			stringBuilder.append(str.substring(0, 1).toUpperCase()).append(str.substring(1, str.length())).append(" ");

		return stringBuilder.toString().trim();
	}
}
