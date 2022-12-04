package com.serviceConsultation.consultation.DAO;

import com.serviceConsultation.consultation.modele.Symptome;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Repository
public class SymptomeDaoImp implements SymptomeDao {

    static String[] symp1= new String[]{"maux de tete", "céphalé", "douleur à la gorge"};
    static Symptome Symp1= new Symptome(symp1,1);
    static String[] symp2= new String[]{"maux de ventre", "douleurs intestinale", "perte du gout"};
    static Symptome Symp2 =new Symptome(symp2,2);
    static String[] symp3= new String[]{"douleur au bras", "fièvre", "incapacité de rotation du bras"};
    static Symptome Symp3 =new Symptome(symp3,3);
    static String[] symp4= new String[]{"maux d'yeux", "ne voit pas de loin", "images floues"};
    static Symptome Symp4 =new Symptome(symp4,4);
    static String[] symp5= new String[]{"nez bouché", "perte d'odorat", "difficulté à respirer"};
    static Symptome Symp5 =new Symptome(symp5,5);
    public static List<Symptome> sympdatabase = new ArrayList<>();
    static {
        sympdatabase.add(Symp1);
        sympdatabase.add(Symp2);
        sympdatabase.add(Symp3);
        sympdatabase.add(Symp4);
        sympdatabase.add(Symp5);


    }


    @Override
    public List<Symptome> findAll() {
        return sympdatabase;
    }

    @Override
    public Symptome findById(int id) {
        for (Symptome symp: sympdatabase){
            if (symp.getId() == id){
                return symp;
            }
        }
        return null;
    }


    @Override
    public Symptome save(Symptome symp) {
        sympdatabase.add(symp);
        return symp;
    }
}
