package seedu.planus;

public class Pair<T, U> {
    private T key;
    private U value;

    public Pair(T inputKey, U inputValue) {
        setKey(inputKey);
        setValue(inputValue);
    }

    private void setKey(T inputKey) {
        this.key = inputKey;
    }

    private void setValue(U inputValue) {
        this.value = inputValue;
    }

    public T getKey() {
        return this.key;
    }

    public U getValue() {
        return this.value;
    }

}
