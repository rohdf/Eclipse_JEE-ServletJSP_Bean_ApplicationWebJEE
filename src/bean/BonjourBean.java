package bean;

import java.io.Serializable;

public class BonjourBean implements Serializable {

 private static final long serialVersionUID = 1L;
 private String nom;

 public String getNom() {
  return nom;
 }

 public void setNom(String nom) {
  this.nom = nom;
 }
}