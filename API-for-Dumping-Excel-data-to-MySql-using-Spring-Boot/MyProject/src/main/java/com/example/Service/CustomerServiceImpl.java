package com.example.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jca.cci.core.support.CommAreaRecord;
import org.springframework.stereotype.Service;

import com.example.Model.Customer;
import com.example.Repository.CustomerDTO;
import com.example.Exception.ProductNotFoundException;


@Service
public class CustomerServiceImpl implements CustomerService {
    
	@Autowired
	private CustomerDTO cdto;
	
	@Override
    public void saveCustomerData()  {
    try {
    	//BufferedReader br=new BufferedReader(new FileReader("src/main/resources/Book2.csv"));
	    //Give any location in your PC
    	BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\aaa\\Book3.csv"));
    	
    	br.readLine();		//ye sab  1st line ko skip karne ke liye likha hai 27 28 line number
    	String line=null;
    	while((line=br.readLine())!=null) {
    		String[] data=line.split(",");
    		Integer[] arr=new Integer[data.length];
    		for(int i=0; i<data.length; i++) {
    			arr[i]= Integer.parseInt(data[i]);
    		}

    		System.out.println("Data ka length: "+data.length);
    		Customer c=new Customer();
    			c.setA(arr[0]);
    			c.setB(arr[1]);
    			c.setC(Integer.parseInt(data[2]));
        		
        		cdto.save(c);
    		//}

        		
        	
        		
    	}
    		
    	
    }catch (IOException e) {
		// TODO: handle exception
    	e.printStackTrace();
	}
     
    }

}


