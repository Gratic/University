package HTMLGenerator;

import java.util.ArrayList;
import java.util.List;

public class HTMLElement implements IHTMLElement {
    HTMLElement parent;
    List<HTMLElement> children;
    String id;
    List<String> classes;
    String value;
    String type;
    String tag;
    String link;
    String attribute;
    String innerHTML;
    String src;
    String rel;
    boolean autofermante;

    public HTMLElement(String tag, HTMLElement parent, String id, List<String> classes, String innerHTML) {
        this.tag = tag;
        this.parent = parent;
        this.id = id;
        this.classes = classes;
        children = new ArrayList<HTMLElement>();
        value = "";
        type = "";
        link = "";
        attribute = "";
        src = "";
        rel = "";
        autofermante = false;

        this.innerHTML = innerHTML;
        if(parent != null)
        {
            parent.addChild(this);
        }

        if(this.classes == null)
            classes = new ArrayList<String>();
    }

    public HTMLElement getParent() {
        return parent;
    }

    public void setParent(HTMLElement parent) {
        this.parent = parent;
    }

    public List<HTMLElement> getChildren() {
        return children;
    }

    public void setChildren(List<HTMLElement> children) {
        this.children = children;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getInnerHTML() {
        return innerHTML;
    }

    public void setInnerHTML(String innerHTML) {
        this.innerHTML = innerHTML;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public boolean isAutofermante() {
        return autofermante;
    }

    public void setAutofermante(boolean autofermante) {
        this.autofermante = autofermante;
    }

    public String stringNumberOfTag()
    {
        String msg = "";
        for(int i = 0; i < this.numberOfParent(); i++)
        {
            msg += "\t";
        }
        return msg;
    }

    @Override
    public void addChild(HTMLElement child) {
        children.add(child);
    }

    @Override
    public int numberOfParent() {
        if(parent == null)
            return 0;
        else
            return 1 + parent.numberOfParent();
    }

    @Override
    public String toString() {
        String msg = "<" + tag;

        if(attribute != "") msg += " " + attribute;
        if(type != "") msg += " type='" + type + "'";
        if(rel != "") msg += " rel='" + rel + "'";
        if(src != "") msg += " src='" + src + "'";
        if(link != "") msg += " link='" + link + "'";
        if(value != "") msg += " value='" + value + "'";

        if(classes != null) {
            msg += " class='";
            for (int i = 0; i < classes.size(); i++) {
                msg += classes.get(i) + " ";
            }
            msg+="'";
        }

        if(autofermante) {
            msg += "/";
            msg += ">";
            return msg;
        }
        msg += ">";


        if(innerHTML != "")
            msg += "\n" + this.stringNumberOfTag() + innerHTML + "\n";

        if(children.size() > 0) {
            msg += "\n";
            for (int i = 0; i < children.size(); i++) {
                msg += children.get(i).stringNumberOfTag();
                msg += children.get(i).toString();
                msg += "\n";
            }
        }

        if(innerHTML != "" || children.size() > 0)
            msg += stringNumberOfTag();
        msg += "</" + tag + ">";
        return msg;
    }
}
