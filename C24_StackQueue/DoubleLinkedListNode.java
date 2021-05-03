package JavaPracticeGitHub.C24_StackQueue;

import java.util.Objects;

public class DoubleLinkedListNode<E> {
    private E value;
    private DoubleLinkedListNode<E> next;
    private DoubleLinkedListNode<E> previous;

    public DoubleLinkedListNode(E value,
                                DoubleLinkedListNode<E> next,
                                DoubleLinkedListNode<E> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public DoubleLinkedListNode(E value) {
        this(value, null, null);
    }

    public DoubleLinkedListNode() {}

    public void value(E value) {
        this.value = value;
    }

    public E value() {
        return value;
    }

    public DoubleLinkedListNode<E> next() {
        return next;
    }

    public void next(DoubleLinkedListNode<E> next) {
        this.next = next;
    }

    public DoubleLinkedListNode<E> prev() {
        return previous;
    }

    public void prev(DoubleLinkedListNode<E> previous) {
        this.previous = previous;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoubleLinkedListNode<?> that = (DoubleLinkedListNode<?>) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
