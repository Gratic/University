package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private String name;
    private List<Component> components;

    public Composite(String name, List<Component> components) {
        this.name = name;
        this.components = components;
    }

    public Composite(String name) {
        this.name = name;
        components = new ArrayList<Component>();
    }

    public void add(Component component)
    {
        getComponents().add(component);
    }

    public void remove(Component component)
    {
        while(getComponents().indexOf(component) != -1)
        {
            getComponents().remove(getComponents().get(getComponents().indexOf(component)));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String msg = getName() + "\n";
        for(Component c : getComponents())
        {
            if (c instanceof Composite)
                msg += "- " + c.toString();
            else
                msg += "-->" + c.toString();
        }
        return msg;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }
}
