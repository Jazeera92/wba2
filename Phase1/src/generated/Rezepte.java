//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.15 um 01:57:35 AM CEST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rezept" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Titel" type="{}titel"/>
 *                   &lt;element name="Beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Bilder">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Bild" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Nummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="Quelle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Zutaten">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Zutat" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Menge" type="{}menge"/>
 *                                       &lt;element name="Einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="portion_id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Zubereitung">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Arbeitszeit">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="zeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Schwierigkeitsgrad" type="{}schwierigkeitsgrad"/>
 *                             &lt;element name="Brennwert">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="wert" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Kommentare">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Kommentar" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Nutzer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Avatar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Zeitstempel">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Tag" type="{}tag"/>
 *                                                 &lt;element name="Monat" type="{}monat"/>
 *                                                 &lt;element name="Jahr" type="{}jahr"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Hilfreich" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="kommentar_id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="rezept_id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rezept"
})
@XmlRootElement(name = "Rezepte")
public class Rezepte {

    @XmlElement(name = "Rezept")
    protected List<Rezepte.Rezept> rezept;

    /**
     * Gets the value of the rezept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rezept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRezept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rezepte.Rezept }
     * 
     * 
     */
    public List<Rezepte.Rezept> getRezept() {
        if (rezept == null) {
            rezept = new ArrayList<Rezepte.Rezept>();
        }
        return this.rezept;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Titel" type="{}titel"/>
     *         &lt;element name="Beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Bilder">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Bild" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Nummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="Quelle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Zutaten">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Zutat" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Menge" type="{}menge"/>
     *                             &lt;element name="Einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="portion_id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Zubereitung">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Arbeitszeit">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="zeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Schwierigkeitsgrad" type="{}schwierigkeitsgrad"/>
     *                   &lt;element name="Brennwert">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="wert" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Kommentare">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Kommentar" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Nutzer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Avatar" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Zeitstempel">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Tag" type="{}tag"/>
     *                                       &lt;element name="Monat" type="{}monat"/>
     *                                       &lt;element name="Jahr" type="{}jahr"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Hilfreich" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="kommentar_id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="rezept_id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "titel",
        "beschreibung",
        "bilder",
        "zutaten",
        "zubereitung",
        "kommentare"
    })
    public static class Rezept {

        @XmlElement(name = "Titel", required = true)
        protected String titel;
        @XmlElement(name = "Beschreibung", required = true)
        protected String beschreibung;
        @XmlElement(name = "Bilder", required = true)
        protected Rezepte.Rezept.Bilder bilder;
        @XmlElement(name = "Zutaten", required = true)
        protected Rezepte.Rezept.Zutaten zutaten;
        @XmlElement(name = "Zubereitung", required = true)
        protected Rezepte.Rezept.Zubereitung zubereitung;
        @XmlElement(name = "Kommentare", required = true)
        protected Rezepte.Rezept.Kommentare kommentare;
        @XmlAttribute(name = "rezept_id", required = true)
        protected int rezeptId;

        /**
         * Ruft den Wert der titel-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitel() {
            return titel;
        }

        /**
         * Legt den Wert der titel-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitel(String value) {
            this.titel = value;
        }

        /**
         * Ruft den Wert der beschreibung-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeschreibung() {
            return beschreibung;
        }

        /**
         * Legt den Wert der beschreibung-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeschreibung(String value) {
            this.beschreibung = value;
        }

        /**
         * Ruft den Wert der bilder-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Rezepte.Rezept.Bilder }
         *     
         */
        public Rezepte.Rezept.Bilder getBilder() {
            return bilder;
        }

        /**
         * Legt den Wert der bilder-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Rezepte.Rezept.Bilder }
         *     
         */
        public void setBilder(Rezepte.Rezept.Bilder value) {
            this.bilder = value;
        }

        /**
         * Ruft den Wert der zutaten-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Rezepte.Rezept.Zutaten }
         *     
         */
        public Rezepte.Rezept.Zutaten getZutaten() {
            return zutaten;
        }

        /**
         * Legt den Wert der zutaten-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Rezepte.Rezept.Zutaten }
         *     
         */
        public void setZutaten(Rezepte.Rezept.Zutaten value) {
            this.zutaten = value;
        }

        /**
         * Ruft den Wert der zubereitung-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Rezepte.Rezept.Zubereitung }
         *     
         */
        public Rezepte.Rezept.Zubereitung getZubereitung() {
            return zubereitung;
        }

        /**
         * Legt den Wert der zubereitung-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Rezepte.Rezept.Zubereitung }
         *     
         */
        public void setZubereitung(Rezepte.Rezept.Zubereitung value) {
            this.zubereitung = value;
        }

        /**
         * Ruft den Wert der kommentare-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Rezepte.Rezept.Kommentare }
         *     
         */
        public Rezepte.Rezept.Kommentare getKommentare() {
            return kommentare;
        }

        /**
         * Legt den Wert der kommentare-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Rezepte.Rezept.Kommentare }
         *     
         */
        public void setKommentare(Rezepte.Rezept.Kommentare value) {
            this.kommentare = value;
        }

        /**
         * Ruft den Wert der rezeptId-Eigenschaft ab.
         * 
         */
        public int getRezeptId() {
            return rezeptId;
        }

        /**
         * Legt den Wert der rezeptId-Eigenschaft fest.
         * 
         */
        public void setRezeptId(int value) {
            this.rezeptId = value;
        }


        /**
         * <p>Java-Klasse f�r anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Bild" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Nummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="Quelle" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "bild"
        })
        public static class Bilder {

            @XmlElement(name = "Bild")
            protected List<Rezepte.Rezept.Bilder.Bild> bild;

            /**
             * Gets the value of the bild property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bild property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBild().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rezepte.Rezept.Bilder.Bild }
             * 
             * 
             */
            public List<Rezepte.Rezept.Bilder.Bild> getBild() {
                if (bild == null) {
                    bild = new ArrayList<Rezepte.Rezept.Bilder.Bild>();
                }
                return this.bild;
            }


            /**
             * <p>Java-Klasse f�r anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Nummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="Quelle" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "nummer",
                "quelle",
                "titel"
            })
            public static class Bild {

                @XmlElement(name = "Nummer")
                protected int nummer;
                @XmlElement(name = "Quelle", required = true)
                protected String quelle;
                @XmlElement(name = "Titel", required = true)
                protected String titel;

                /**
                 * Ruft den Wert der nummer-Eigenschaft ab.
                 * 
                 */
                public int getNummer() {
                    return nummer;
                }

                /**
                 * Legt den Wert der nummer-Eigenschaft fest.
                 * 
                 */
                public void setNummer(int value) {
                    this.nummer = value;
                }

                /**
                 * Ruft den Wert der quelle-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQuelle() {
                    return quelle;
                }

                /**
                 * Legt den Wert der quelle-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQuelle(String value) {
                    this.quelle = value;
                }

                /**
                 * Ruft den Wert der titel-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTitel() {
                    return titel;
                }

                /**
                 * Legt den Wert der titel-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTitel(String value) {
                    this.titel = value;
                }

            }

        }


        /**
         * <p>Java-Klasse f�r anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Kommentar" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Nutzer" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Avatar" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Zeitstempel">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Tag" type="{}tag"/>
         *                             &lt;element name="Monat" type="{}monat"/>
         *                             &lt;element name="Jahr" type="{}jahr"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Hilfreich" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="kommentar_id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "titel",
            "kommentar"
        })
        public static class Kommentare {

            @XmlElement(name = "Titel", required = true)
            protected String titel;
            @XmlElement(name = "Kommentar", required = true)
            protected List<Rezepte.Rezept.Kommentare.Kommentar> kommentar;

            /**
             * Ruft den Wert der titel-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitel() {
                return titel;
            }

            /**
             * Legt den Wert der titel-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitel(String value) {
                this.titel = value;
            }

            /**
             * Gets the value of the kommentar property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the kommentar property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getKommentar().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rezepte.Rezept.Kommentare.Kommentar }
             * 
             * 
             */
            public List<Rezepte.Rezept.Kommentare.Kommentar> getKommentar() {
                if (kommentar == null) {
                    kommentar = new ArrayList<Rezepte.Rezept.Kommentare.Kommentar>();
                }
                return this.kommentar;
            }


            /**
             * <p>Java-Klasse f�r anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Nutzer" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Avatar" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Zeitstempel">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Tag" type="{}tag"/>
             *                   &lt;element name="Monat" type="{}monat"/>
             *                   &lt;element name="Jahr" type="{}jahr"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Hilfreich" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="kommentar_id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "nutzer",
                "avatar",
                "zeitstempel",
                "text",
                "hilfreich"
            })
            public static class Kommentar {

                @XmlElement(name = "Nutzer", required = true)
                protected String nutzer;
                @XmlElement(name = "Avatar", required = true)
                protected String avatar;
                @XmlElement(name = "Zeitstempel", required = true)
                protected Rezepte.Rezept.Kommentare.Kommentar.Zeitstempel zeitstempel;
                @XmlElement(name = "Text", required = true)
                protected String text;
                @XmlElement(name = "Hilfreich", required = true)
                protected String hilfreich;
                @XmlAttribute(name = "kommentar_id", required = true)
                protected int kommentarId;

                /**
                 * Ruft den Wert der nutzer-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNutzer() {
                    return nutzer;
                }

                /**
                 * Legt den Wert der nutzer-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNutzer(String value) {
                    this.nutzer = value;
                }

                /**
                 * Ruft den Wert der avatar-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAvatar() {
                    return avatar;
                }

                /**
                 * Legt den Wert der avatar-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAvatar(String value) {
                    this.avatar = value;
                }

                /**
                 * Ruft den Wert der zeitstempel-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Rezepte.Rezept.Kommentare.Kommentar.Zeitstempel }
                 *     
                 */
                public Rezepte.Rezept.Kommentare.Kommentar.Zeitstempel getZeitstempel() {
                    return zeitstempel;
                }

                /**
                 * Legt den Wert der zeitstempel-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Rezepte.Rezept.Kommentare.Kommentar.Zeitstempel }
                 *     
                 */
                public void setZeitstempel(Rezepte.Rezept.Kommentare.Kommentar.Zeitstempel value) {
                    this.zeitstempel = value;
                }

                /**
                 * Ruft den Wert der text-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getText() {
                    return text;
                }

                /**
                 * Legt den Wert der text-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setText(String value) {
                    this.text = value;
                }

                /**
                 * Ruft den Wert der hilfreich-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHilfreich() {
                    return hilfreich;
                }

                /**
                 * Legt den Wert der hilfreich-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHilfreich(String value) {
                    this.hilfreich = value;
                }

                /**
                 * Ruft den Wert der kommentarId-Eigenschaft ab.
                 * 
                 */
                public int getKommentarId() {
                    return kommentarId;
                }

                /**
                 * Legt den Wert der kommentarId-Eigenschaft fest.
                 * 
                 */
                public void setKommentarId(int value) {
                    this.kommentarId = value;
                }


                /**
                 * <p>Java-Klasse f�r anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Tag" type="{}tag"/>
                 *         &lt;element name="Monat" type="{}monat"/>
                 *         &lt;element name="Jahr" type="{}jahr"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "tag",
                    "monat",
                    "jahr"
                })
                public static class Zeitstempel {

                    @XmlElement(name = "Tag")
                    protected int tag;
                    @XmlElement(name = "Monat")
                    protected int monat;
                    @XmlElement(name = "Jahr")
                    protected int jahr;

                    /**
                     * Ruft den Wert der tag-Eigenschaft ab.
                     * 
                     */
                    public int getTag() {
                        return tag;
                    }

                    /**
                     * Legt den Wert der tag-Eigenschaft fest.
                     * 
                     */
                    public void setTag(int value) {
                        this.tag = value;
                    }

                    /**
                     * Ruft den Wert der monat-Eigenschaft ab.
                     * 
                     */
                    public int getMonat() {
                        return monat;
                    }

                    /**
                     * Legt den Wert der monat-Eigenschaft fest.
                     * 
                     */
                    public void setMonat(int value) {
                        this.monat = value;
                    }

                    /**
                     * Ruft den Wert der jahr-Eigenschaft ab.
                     * 
                     */
                    public int getJahr() {
                        return jahr;
                    }

                    /**
                     * Legt den Wert der jahr-Eigenschaft fest.
                     * 
                     */
                    public void setJahr(int value) {
                        this.jahr = value;
                    }

                }

            }

        }


        /**
         * <p>Java-Klasse f�r anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Arbeitszeit">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="zeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Schwierigkeitsgrad" type="{}schwierigkeitsgrad"/>
         *         &lt;element name="Brennwert">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="wert" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "arbeitszeit",
            "schwierigkeitsgrad",
            "brennwert",
            "text"
        })
        public static class Zubereitung {

            @XmlElement(name = "Arbeitszeit", required = true)
            protected Rezepte.Rezept.Zubereitung.Arbeitszeit arbeitszeit;
            @XmlElement(name = "Schwierigkeitsgrad", required = true)
            protected Schwierigkeitsgrad schwierigkeitsgrad;
            @XmlElement(name = "Brennwert", required = true)
            protected Rezepte.Rezept.Zubereitung.Brennwert brennwert;
            @XmlElement(name = "Text", required = true)
            protected String text;

            /**
             * Ruft den Wert der arbeitszeit-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Rezepte.Rezept.Zubereitung.Arbeitszeit }
             *     
             */
            public Rezepte.Rezept.Zubereitung.Arbeitszeit getArbeitszeit() {
                return arbeitszeit;
            }

            /**
             * Legt den Wert der arbeitszeit-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Rezepte.Rezept.Zubereitung.Arbeitszeit }
             *     
             */
            public void setArbeitszeit(Rezepte.Rezept.Zubereitung.Arbeitszeit value) {
                this.arbeitszeit = value;
            }

            /**
             * Ruft den Wert der schwierigkeitsgrad-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Schwierigkeitsgrad }
             *     
             */
            public Schwierigkeitsgrad getSchwierigkeitsgrad() {
                return schwierigkeitsgrad;
            }

            /**
             * Legt den Wert der schwierigkeitsgrad-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Schwierigkeitsgrad }
             *     
             */
            public void setSchwierigkeitsgrad(Schwierigkeitsgrad value) {
                this.schwierigkeitsgrad = value;
            }

            /**
             * Ruft den Wert der brennwert-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Rezepte.Rezept.Zubereitung.Brennwert }
             *     
             */
            public Rezepte.Rezept.Zubereitung.Brennwert getBrennwert() {
                return brennwert;
            }

            /**
             * Legt den Wert der brennwert-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Rezepte.Rezept.Zubereitung.Brennwert }
             *     
             */
            public void setBrennwert(Rezepte.Rezept.Zubereitung.Brennwert value) {
                this.brennwert = value;
            }

            /**
             * Ruft den Wert der text-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getText() {
                return text;
            }

            /**
             * Legt den Wert der text-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setText(String value) {
                this.text = value;
            }


            /**
             * <p>Java-Klasse f�r anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="zeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "zeit",
                "einheit"
            })
            public static class Arbeitszeit {

                @XmlElement(required = true)
                protected String zeit;
                @XmlElement(name = "Einheit", required = true)
                protected String einheit;

                /**
                 * Ruft den Wert der zeit-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getZeit() {
                    return zeit;
                }

                /**
                 * Legt den Wert der zeit-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setZeit(String value) {
                    this.zeit = value;
                }

                /**
                 * Ruft den Wert der einheit-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEinheit() {
                    return einheit;
                }

                /**
                 * Legt den Wert der einheit-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEinheit(String value) {
                    this.einheit = value;
                }

            }


            /**
             * <p>Java-Klasse f�r anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="wert" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "wert",
                "einheit"
            })
            public static class Brennwert {

                @XmlElement(required = true)
                protected String wert;
                @XmlElement(name = "Einheit", required = true)
                protected String einheit;

                /**
                 * Ruft den Wert der wert-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWert() {
                    return wert;
                }

                /**
                 * Legt den Wert der wert-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWert(String value) {
                    this.wert = value;
                }

                /**
                 * Ruft den Wert der einheit-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEinheit() {
                    return einheit;
                }

                /**
                 * Legt den Wert der einheit-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEinheit(String value) {
                    this.einheit = value;
                }

            }

        }


        /**
         * <p>Java-Klasse f�r anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Zutat" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Menge" type="{}menge"/>
         *                   &lt;element name="Einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="portion_id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "zutat"
        })
        public static class Zutaten {

            @XmlElement(name = "Zutat")
            protected List<Rezepte.Rezept.Zutaten.Zutat> zutat;
            @XmlAttribute(name = "portion_id", required = true)
            protected int portionId;

            /**
             * Gets the value of the zutat property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the zutat property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getZutat().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rezepte.Rezept.Zutaten.Zutat }
             * 
             * 
             */
            public List<Rezepte.Rezept.Zutaten.Zutat> getZutat() {
                if (zutat == null) {
                    zutat = new ArrayList<Rezepte.Rezept.Zutaten.Zutat>();
                }
                return this.zutat;
            }

            /**
             * Ruft den Wert der portionId-Eigenschaft ab.
             * 
             */
            public int getPortionId() {
                return portionId;
            }

            /**
             * Legt den Wert der portionId-Eigenschaft fest.
             * 
             */
            public void setPortionId(int value) {
                this.portionId = value;
            }


            /**
             * <p>Java-Klasse f�r anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Menge" type="{}menge"/>
             *         &lt;element name="Einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "menge",
                "einheit",
                "name"
            })
            public static class Zutat {

                @XmlElement(name = "Menge")
                protected float menge;
                @XmlElement(name = "Einheit", required = true)
                protected String einheit;
                @XmlElement(name = "Name", required = true)
                protected String name;

                /**
                 * Ruft den Wert der menge-Eigenschaft ab.
                 * 
                 */
                public float getMenge() {
                    return menge;
                }

                /**
                 * Legt den Wert der menge-Eigenschaft fest.
                 * 
                 */
                public void setMenge(float value) {
                    this.menge = value;
                }

                /**
                 * Ruft den Wert der einheit-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEinheit() {
                    return einheit;
                }

                /**
                 * Legt den Wert der einheit-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEinheit(String value) {
                    this.einheit = value;
                }

                /**
                 * Ruft den Wert der name-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Legt den Wert der name-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }

        }

    }

}
