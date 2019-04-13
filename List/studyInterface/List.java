package studyInterface;

public interface List<T> {
    public void add();
    public void addAll();
    public T get();
    public boolean contain();
    public int indexOf();
    public void remove();
    public int size();
    public void clear();
    public Iterator<T> iterator();
}
