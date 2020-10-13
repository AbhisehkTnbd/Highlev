import java.io.*;
class b
{
double s,v,f,i,it,dps,dp,cpu;
double op,ebt,eat,poesh;
double pvr,sal,rsal,bep,beps,cs;


double c,p,a,wew,pc,vo,hs,rs;
double bepina,bepinu,bepinc;

public void margin()

{
System.out.println("\n \t now the contribution is = "+c);

System.out.println("\n \t now the Sales is = "+s);
System.out.println("\n \t variable cost="+v);
System.out.println("\n \t fixed cost="+f);
System.out.println("\n \t profit is ="+p);

}
public void res()
{
System.out.println("\n \t now the programe will calculate the REQUIRED SALES");


c=f+dp;
hs=c*100/pvr;

System.out.println("\n \t REQUIRED SALES in amount ="+hs);

rs=(dp+f)/cpu;
System.out.println("\n \t REQUIRED SALES in unit="+rs);
}



}



class d extends b
{
double os,pu,w,dx,cs,o,sr,intp,soa;

double oe,r,ra,ins,se,d,dep,sala,ove,adm,sales,vv;

double noe,nop,np,pft,in,prd;

double cogs,gp,interst,dividend;
public void pandl()
{

cogs=os+pu+w+o+dx-cs;
gp=(sales)-(cogs+sr);
System.out.println("\n \t cost of goods SOLD IS = "+cogs);
System.out.println("\n \t GROSS PROFIT IS = "+gp);
noe=(interst+dividend);
nop=soa+intp;
oe=(gp)-(r+ra+ins+se+d+dep+sala+ove+adm);
vv=oe+nop;
np=(np)-(pft-in)-(noe);
np=np-prd;
System.out.println("\n \t after add NON OPERATING income WAS= "+vv);
System.out.println("\n \t NEt OPERATING EXP = "+oe);
System.out.println("\n \t NEt NON OPERATING EXP WAS= "+nop);

System.out.println("\n \t provision for taxtion was= "+pft);
System.out.println("\n \t  income tax was= "+in);
System.out.println("\n \t NET profit after tax & interst = "+np);

System.out.println("\n \t NET profit after proposed dividend = "+np);
}
}

class e extends d
{




double esc,psc,ras,pla,sl,pe,ltl,car,gnr,sif;
double cas,fa,inve,cl,wcap,tfe,me,de,tin;
double sto,debe,cab,sti,pexp,mca,brr;
double bod,cre,bpa,pft,tp,pdev,oexp,lab,pam,fun,fix,oth;
public void bs()
{ 
double  sof,br;
ras=car+gnr+sif;
ltl=me+de;
sof=(esc+psc+ras)-(pla+sl+pe+ltl);
cas=sto+debe+cab+sti+pexp+mca+brr;
cl=bod+cre+bpa+pft+tp+pdev+oexp;
wcap=cas-cl;

fa=lab+pam+fun+fix+oth;
System.out.println("\n  \n \t \t NET FIXED ASSTES = "+fa);
inve=ltl+tin;
System.out.println("\n  \t investment="+inve);
tfe=(fa+wcap+tin);
System.out.println("\n  \n \t \t _NET WORKING CAPTILE_  = "+wcap);
System.out.println("\n  \n \t \t NET  _total founds employed_ = "+tfe);
}

}



class Highlev
  {
  public static void main (String args[])throws IOException
  {
e obj = new e(); 
int i,a;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

System.out.println("\n \t enter 1 for marginal cost statment programe and ");
System.out.println("\n \t 2 for compratave profit & loss acc. programe");
System.out.println("\n \t enter 3 for comprative balance_sheet pro");
i=Integer.parseInt(br.readLine());
if(i==1)
{
System.out.println("\n \t IF ANY AMOUNT NOT PRESENT THEN ENTER = O");

System.out.println("\n \t enter SALES");
obj.s=Integer.parseInt(br.readLine());

System.out.println("\n \t enter VARIBVLE COST");
obj.v=Integer.parseInt(br.readLine());

System.out.println("\n \t enter CONTRIBUTION");
obj.c=Integer.parseInt(br.readLine());

System.out.println("\n \t enter FIXED COST");
obj.f=Integer.parseInt(br.readLine());

System.out.println("\n \t enter PROFIT");
obj.p=Integer.parseInt(br.readLine());

System.out.println("\n \t enter desired profit");
obj.dp=Integer.parseInt(br.readLine());



System.out.println("\n \t if you not enter fixed cost & profit & variable cost then you must");

System.out.println("\n \t enter p/v ratio");
obj.pvr=Integer.parseInt(br.readLine()); 

System.out.println("\n \t enter contribution per unit");
obj.cpu=Integer.parseInt(br.readLine()); 

System.out.println("\n \t enter 8 if you all ready enter sales"); 
System.out.println("\n \t enter 1 if you have variable  fixed cost or profit");
System.out.println("\n \t enter 2 if you have variable cost & contribution"); 
a=Integer.parseInt(br.readLine()); 
 
if(a==8)
{  
System.out.println("\n \t now process for contribution");
}
else
{

if(a==1)
{
obj.s=obj.v+obj.f+obj.p;                                
}
else if(a==2) 
{
obj.s=obj.v+obj.c;                              
}
else                                                                                    
{
a=0;
}
 
}
a=0;
System.out.println("\n \t enter 1 if you have if you already enter sales & variable cost");
System.out.println("\n \t enter 2 if you already enter fixed cost & profit ");
a=Integer.parseInt(br.readLine()); 
if(a==1)
{
obj.c=obj.s-obj.v;                     
} 
else if(a==2)
{
obj.c=obj.f+obj.p;
}
else
{

obj.c=obj.s*obj.pvr/100;
}

obj.v=obj.s-obj.c;


obj.f=obj.s-obj.v-obj.p;
obj.margin();
obj.res();

}
else if(i==2)
{
System.out.println("\n \t enter sales");
obj.sales=Integer.parseInt(br.readLine()); 

System.out.println("\n \t enter opening stock");
obj.os=Integer.parseInt(br.readLine()); 

System.out.println("\n \t enter purchase ");
obj.pu=Integer.parseInt(br.readLine()); 

System.out.println("\n \t enter wages");
obj.w=Integer.parseInt(br.readLine()); 

System.out.println("\n \t enter closing stock");
obj.cs=Integer.parseInt(br.readLine()); 

System.out.println("\n \t enter direct expences");
obj.dx=Integer.parseInt(br.readLine()); 

System.out.println("\n \t enter  sales return");
obj.sr=Integer.parseInt(br.readLine()); 

System.out.println("\n \t enter interst");
obj.interst=Integer.parseInt(br.readLine()); 

System.out.println("\n \t enter dividend");
obj.dividend=Integer.parseInt(br.readLine()); 


System.out.println("\n \t enter any loss on sale of assets");
obj.soa=Integer.parseInt(br.readLine()); 

System.out.println("\n \t enter any interst paid");
obj.intp=Integer.parseInt(br.readLine()); 

System.out.println("\n \t  continuly enter rant,rates & insurance");
obj.r=Integer.parseInt(br.readLine()); 
obj.ra=Integer.parseInt(br.readLine()); 
obj.ins=Integer.parseInt(br.readLine()); 

System.out.println("\n \t enter selling exp");
obj.se=Integer.parseInt(br.readLine()); 

System.out.println("\n \t enter discount");
obj.d=Integer.parseInt(br.readLine()); 

System.out.println("\n \t enter depreciation");
obj.dep=Integer.parseInt(br.readLine()); 

System.out.println("\n \t enter salsrise");
obj.sala=Integer.parseInt(br.readLine()); 

System.out.println("\n \t enter  overhead ");
obj.ove=Integer.parseInt(br.readLine()); 

System.out.println("\n \t enter administrative exp");
obj.adm=Integer.parseInt(br.readLine()); 

System.out.println("\n \t enter non operating profit");
obj.nop=Integer.parseInt(br.readLine()); 

              System.out.println("\n \t enter  provision for taxtion");
obj.pft=Integer.parseInt(br.readLine()); 

System.out.println("\n \t enter income tax");
obj.in=Integer.parseInt(br.readLine()); 

      System.out.println("\n \t enter  proposed dividend");
obj.prd=Integer.parseInt(br.readLine()); 

obj.pandl();
}

else if(i==3)
{

System.out.println("\n \t  continue enter captial reserv,general rev & sinking fund");
 obj.car=Integer.parseInt(br.readLine()); 
 obj.gnr=Integer.parseInt(br.readLine());                                                                                                      
 obj.sif=Integer.parseInt(br.readLine());                   
System.out.println("\n \t  continue enter long term loan=mortages & debenture &  trade invest");
 obj.me=Integer.parseInt(br.readLine());     
 obj.de=Integer.parseInt(br.readLine()); 
obj.tin=Integer.parseInt(br.readLine());   
                                                                                                 
System.out.println("\n \t enter equity share captile");
obj.esc=Integer.parseInt(br.readLine());   
System.out.println("\n \t enter perferance share captile");
obj.psc=Integer.parseInt(br.readLine());   
System.out.println("\n \t ENTER net amount of profit & loss acc.");
obj.pla=Integer.parseInt(br.readLine());   
System.out.println("\n \t enter NET secured & nu secured loan");
obj.sl=Integer.parseInt(br.readLine());   

System.out.println("\n \t enteR preliminary expencess");
obj.pe=Integer.parseInt(br.readLine());      
                                                                                                  
System.out.println("\n \t enter  stock");
obj.sto=Integer.parseInt(br.readLine());   

System.out.println("\n \t enter debtors");
obj.debe=Integer.parseInt(br.readLine());   

System.out.println("\n \t enter cash & bank");
obj.cab=Integer.parseInt(br.readLine());   

System.out.println("\n \t enter short thrm inve");
obj.sti=Integer.parseInt(br.readLine());   

System.out.println("\n \t enter perpaid exp");
obj.pexp=Integer.parseInt(br.readLine());   

System.out.println("\n \t enter misc current ass");
obj.mca=Integer.parseInt(br.readLine());   

System.out.println("\n \t enter bill receviable");   
obj.brr=Integer.parseInt(br.readLine());                                                     


System.out.println("\n \t enter bank over draft");   
obj.bod=Integer.parseInt(br.readLine());   
System.out.println("\n \t enter creditors");   
obj.cre=Integer.parseInt(br.readLine());   
System.out.println("\n \t enter bill payable   "); 
                obj.bpa=Integer.parseInt(br.readLine());   
System.out.println("\n \t enter  provision for taxtion  ");    
                obj.pft=Integer.parseInt(br.readLine());   
System.out.println("\n \t enter tax payable");                  
                     obj.tp=Integer.parseInt(br.readLine());   
System.out.println("\n \t enter   proposed dividend");            
              obj.pdev=Integer.parseInt(br.readLine());   
System.out.println("\n \t enter   micsc current liabilities");        
                     obj.oexp=Integer.parseInt(br.readLine());       
                                  
                                          
    System.out.println("\n \t enter  land and buliding   ");        
         obj.lab=Integer.parseInt(br.readLine());   
System.out.println("\n \t enter    plant & mishinery");         
           obj.pam=Integer.parseInt(br.readLine());   
System.out.println("\n \t enter furnture");                             
          obj.fun=Integer.parseInt(br.readLine());   
System.out.println("\n \t enter  fixture ");                          
obj.fix=Integer.parseInt(br.readLine());   
System.out.println("\n \t enter   other fixed assets");    
                         obj.oth=Integer.parseInt(br.readLine());
                
obj.bs();
} 
else  {
System.out.println("\n \t  PLEASE enter YOUR RIGHT CHOICE................THANKE_YOU");  }

System.out.println("\n \t  _created By............................................._'ABHI'_");
}

}