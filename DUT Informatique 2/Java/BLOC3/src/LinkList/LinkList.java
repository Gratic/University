package LinkList;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

public class LinkList<T> {
    private T obj;
    private LinkList<T> next;

    public LinkList(T obj, LinkList<T> next) {
        this.obj = obj;
        this.next = next;
    }

    public LinkList(T obj) {
        this.obj = obj;
        this.next = null;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public LinkList<T> getNext() {
        return next;
    }

    public void setNext(LinkList<T> next) {
        this.next = next;
    }

    public T getFirst()
    {
        return getObj();
    }

    public T getSecond()
    {
        return next.getObj();
    }

    public int getLength()
    {
        if(next == null)
            return 1;
        else
            return 1 + next.getLength();
    }

    public T getLastElement()
    {
        if(next == null)
            return getObj();
        else
            return next.getLastElement();
    }

    public T getElementAt(int index)
    {
        if(index == 0)
            return this.getObj();
        else if (getNext() != null)
            return next.getElementAt(index - 1);
        else
            System.out.println("Erreur, index plus long que la liste");

        return null;
    }

    public void addFirst(T obj)
    {
        LinkList buffer = new LinkList(this.getObj(), this.getNext());
        this.setObj(obj);
        this.setNext(buffer);
    }

    public void addLast(T obj)
    {
        if(next == null)
            this.next = new LinkList<T>(obj);
        else
            next.addLast(obj);
    }

    public void addElementAt(int index, T obj)
    {
        if(index - 1 == 0)
        {
            // LinkList<T> buffer = this.getNext();
            setNext(new LinkList<T>(obj, getNext()));
        }
        else
            next.addElementAt(index - 1, obj);
    }

    public void deleteElement(T obj)
    {
        if(getLength() == 2)
        {
            if(getNext().getObj().equals(obj))
            {
                if(getNext().getNext() != null)
                {
                    this.setNext(getNext().getNext());
                }
                else
                {
                    this.setNext(null);
                }
            }
        }
        else
            next.deleteElement(obj);
    }

    public void deleteElementAt(int index)
    {
        if(index == 1)
        {
            System.out.print("Del from :" + getObj().toString());
            if(getNext() != null)
            {
                System.out.print(" not null ");
                if(getNext().getNext() != null)
                {
                    System.out.print(" not null ");
                    setNext(getNext().getNext());
                }
                else
                    setNext(null);
            }
            else
                System.out.println("Erreur : l'index n'existe pas.");
            System.out.println();
        }
        else
            next.deleteElementAt(index - 1);
    }

    @Override
    public String toString() {
        if(next == null)
        {
            return getObj().toString();
        }
        else
            return getObj().toString() + " " + next.toString();
    }
}
