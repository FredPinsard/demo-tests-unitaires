package fr.diginamic.immobilier.entites;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaisonTest {

    Maison maison;
    static Piece wc1;
    static Piece wc2;
    static Piece salleDeBain1;
    static Piece salleDeBain2;
    static Piece chambre1;
    static Piece chambre2;
    static Piece chambre3;
    static Piece salon;
    static Piece cuisine;


    @BeforeAll
    static void beforeAll() {
        wc1 = new WC(1,1);
        wc2 = new WC(0,1);
        salleDeBain1 = new SalleDeBain(1,1);
        salleDeBain2 = new SalleDeBain(0,1);
        chambre1 = new Chambre(1,1);
        chambre2 = new Chambre(1,1);
        chambre3 = new Chambre(1,1);
        salon = new Salon(1,1);
        cuisine = new Cuisine(1,1);
    }

    @BeforeEach
    void setUp() {
        maison = new Maison();
    }

    @Test
    void ajouterPiece() {
        maison.ajouterPiece(wc1);
        Piece[] pieces = maison.getPieces();
        assertEquals(1, pieces.length);
    }
    @Test
    void ajouterPiece_Null() {
        maison.ajouterPiece(null);
        Piece[] pieces = maison.getPieces();
        assertEquals(0, pieces.length);
    }

    @Test
    void nbPieces() {
        maison.ajouterPiece(wc1);
        maison.ajouterPiece(wc2);
        maison.ajouterPiece(salleDeBain1);
        maison.ajouterPiece(salon);
        maison.ajouterPiece(null);
        assertEquals(4, maison.nbPieces());
    }


    @Test
    void superficieEtage() {
        maison.ajouterPiece(wc1);
        maison.ajouterPiece(wc2);
        maison.ajouterPiece(salleDeBain1);
        maison.ajouterPiece(salon);
        maison.ajouterPiece(null);
        double v = maison.superficieEtage(1);
        assertEquals(3.0, v);
    }

    @Test
    void superficieTypePiece_wc() {
        maison.ajouterPiece(wc1);
        maison.ajouterPiece(wc2);
        maison.ajouterPiece(salleDeBain1);
        maison.ajouterPiece(salon);
        maison.ajouterPiece(null);
        double wc = maison.superficieTypePiece("wc");
        assertEquals(2.0, wc);
    }

    @Test
    void superficieTypePiece_Wc() {
        maison.ajouterPiece(wc1);
        maison.ajouterPiece(wc2);
        maison.ajouterPiece(salleDeBain1);
        maison.ajouterPiece(salon);
        maison.ajouterPiece(null);
        double wc = maison.superficieTypePiece("Wc");
        assertEquals(2.0, wc);
    }

    @Test
    void superficieTypePiece_WC() {
        maison.ajouterPiece(wc1);
        maison.ajouterPiece(wc2);
        maison.ajouterPiece(salleDeBain1);
        maison.ajouterPiece(salon);
        maison.ajouterPiece(null);
        double wc = maison.superficieTypePiece("WC");
        assertEquals(2.0, wc);
    }

    @Test
    void superficieTypePiece_null() {
        maison.ajouterPiece(wc1);
        maison.ajouterPiece(wc2);
        maison.ajouterPiece(salleDeBain1);
        maison.ajouterPiece(salon);
        maison.ajouterPiece(null);
        double wc = maison.superficieTypePiece(null);
        assertEquals(0.0, wc);
    }



    @Test
    void calculerSurface() {
        maison.ajouterPiece(wc1);
        maison.ajouterPiece(wc2);
        maison.ajouterPiece(salleDeBain1);
        maison.ajouterPiece(salon);
        maison.ajouterPiece(null);
        double v = maison.calculerSurface();
        assertEquals(4.0, v);
    }
}