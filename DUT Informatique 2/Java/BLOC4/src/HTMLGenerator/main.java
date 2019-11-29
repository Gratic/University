package HTMLGenerator;

import javax.swing.text.html.HTML;

public class main {
    public static void main(String[] args) {
        HTMLElement html = new HTMLElement("html", null, null, null, "");
        HTMLElement head = new HTMLElement("head", html, null, null, "");
        HTMLElement body = new HTMLElement("body", html, null, null, "");

        HTMLElement meta = new HTMLElement("meta", head, null, null, "");
        meta.setAttribute("charset='utf-8'");
        meta.setAutofermante(true);
        HTMLElement title = new HTMLElement("title", head, null, null, "Super site");
        HTMLElement css = new HTMLElement("style", head, null, null, "");
        css.setRel("stylesheet");
        css.setType("text/css");
        css.setSrc("style.css");
        css.setAutofermante(true);

        HTMLElement section = new HTMLElement("section", body, "beer-section", null, "");
        HTMLElement sectionTitle = new HTMLElement("h1", section, null, null, "Titre de section");
        HTMLElement sectionBoyd = new HTMLElement("p", section, null, null, "Je suis du texte qui parle du titre de la section");

        HTMLElement script = new HTMLElement("script", body, null, null, "");
        script.setType("text/javascript");
        script.setSrc("main.js");

        System.out.println(html);
    }
}
