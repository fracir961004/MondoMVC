package snippet;

public class Snippet {
	public static void main(String[] args) {
		<servlet>
				<servlet-name>Nazione</servlet-name>
				<servlet-class>it.objectmethod.mondo.servlets.NazioneServlet</servlet-class>
			</servlet>
		
			<servlet-mapping>
				<servlet-name>Nazione</servlet-name>
				<url-pattern>/NazioneServlet</url-pattern>
			</servlet-mapping>
		
	}
}

