
## Servlet

#### Plan: 
Installing Tomcat 

downloading, 
```{code:xml}
<tomcat-users>
<user username="admin" password="admin" roles="manager-gui,admin-gui"/>
```
conf/web.xml  
org.apache.jasper.servlet.JspServlet
```
 <init-param>
            <param-name>compilerSourceVM</param-name>
            <param-value>1.8</param-value>
        </init-param>
        <init-param>
            <param-name>compilerTargetVM</param-name>
            <param-value>1.8</param-value>
 </init-param>
```
File structure

/WEB-INF/web.xml 
/WEB-INF/classes/


#### Task: