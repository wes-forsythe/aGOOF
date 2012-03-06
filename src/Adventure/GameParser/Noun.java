/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import static Adventure.GameParser.Word.PartsOfSpeech.*;
/**
 *
 * @author jeffj, kevinratton
 */
public class Noun extends Word {
    
    private String pronoun = "it";
    private String article = "the";
    private String description;
    /**
     * takes string word to set type to noun
     * @param word  string word type noun
     */
    public Noun(String word) {
        super(word, NOUN);
    }
    /**
     * takes 2 strings, one of type article, one to be noun
     * @param article 
     * @param word 
     */
    public Noun(String article, String word) {
        this(word);
        this.article = article;        
    }
    /**
     * call to word get() method to return word
     * @return 
     */
    public String Name() {
        return this.get();
    }
    /**
     * returns name of an article type
     * @return
     */
    public String ArticleName() {
        return this.article+" "+this.get();
    }
    /**
     * gets the description
     * @return description
     */
    public String Description() {
        return description;
    }
    /**
     * takes parameter to set description
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * takes parameter to set to type article
     * @param article 
     */
    public void setArticle(String article) {
        this.article = article;
    }
    /**
     * takes parameter to set to type pronoun
     * @param pronoun 
     */
    public void setPronoun(String pronoun) {
        this.pronoun = pronoun;
    }
    /**
     * call to word toString() method
     * @return 
     */
    @Override
    public String toString() {
        return "NOBJ("+super.toString()+")";
    }
}