package com.vicchern.innovationapp.dto;

import javax.validation.Valid;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListWrapperDTO<T> {
    
    @Valid
    private final List<T> list;

    public ListWrapperDTO() {
        this(new LinkedList<T>());
    }

    public ListWrapperDTO(@Valid List<T> list) {
        this.list = list;
    }


    public List<T> getList() {
        return list;
    }

    public ListWrapperDTO<T> addKekItem(T item) {
        list.add(item);

        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListWrapperDTO)) return false;
        ListWrapperDTO<?> that = (ListWrapperDTO<?>) o;
        return Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    @Override
    public String toString() {
        return "ListDto{"
                + "list="
                + list.stream().map(T::toString)
                .collect(Collectors.joining(","))
                + '}';
    }
}
