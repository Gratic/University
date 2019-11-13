package Chaine;

public class LinkList<T> {
    private T element;
    private LinkList<T> next;

    public LinkList(T obj, LinkList<T> next) {
        this.element = obj;
        this.next = next;
    }

    public LinkList(T obj) {
        this.element = obj;
        this.next = null;
    }

    public T getFirstElement()
    {
        return element;
    }

    public T getNextElement()
    {
        return next.element;
    }

    public int linkLength()
    {
        int length = 1;
        LinkList<T> element = this;
        while(element.next != null)
        {
            element = element.next;
            length++;
        }
        return length;
    }

    public T lastElement()
    {
        LinkList<T> list = this;
        while(list.next != null)
        {
            list = list.next;
        }
        return list.element;
    }

    public LinkList<T> lastLink()
    {
        LinkList<T> list = this;
        while(list.next != null)
        {
            list = list.next;
        }
        return list;
    }

    public T elementAtIndex(int index)
    {
        LinkList<T> list = this;
        for(int i = 0; i < index + 1; i++)
        {
            list = list.next;
        }
        return list.element;
    }

    public LinkList<T> linkAtIndex(int index)
    {
        LinkList<T> list = this;
        for(int i = 1; i < index + 1; i++)
        {
            list = list.next;
        }
        return list;
    }

    public LinkList<T> prepend(T element)
    {
        return new LinkList<T>(element, this);
    }

    public void append(T element)
    {
        lastLink().next = new LinkList<T>(element, null);
    }

    public void addAtIndex(int index, T element)
    {
        if(index > 0)
        {
            LinkList<T> before = linkAtIndex(index - 1);
            LinkList<T> on = linkAtIndex(index);

            before.next = new LinkList<T>(element, on);
        }
        else
            prepend(element);
    }

    public void deleteElementAt(int index)
    {
        if(index > 0)
        {
            LinkList<T> before = linkAtIndex(index - 1);
            LinkList<T> after = linkAtIndex(index + 1);
            before.next = after;
        }
    }

    public void deleteElement(T element)
    {
        LinkList<T> list = this;
        for(int i = 0; i < this.linkLength(); i++)
        {
            if(list.element.equals(element))
            {
                deleteElementAt(i);
            }

            list = list.next;
        }
    }

    public void toStringAll()
    {
        LinkList<T> list = this;
        System.out.print(list.element.toString() + " ");
        while(list.next != null)
        {
            list = list.next;
            System.out.print(list.element.toString() + " ");
        }
        System.out.println();
    }

}