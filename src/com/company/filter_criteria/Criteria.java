package com.company.filter_criteria;

import java.util.List;

public interface Criteria {
	List<Person> meetCriteria(List<Person> persons);
}