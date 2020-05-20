<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<jsp:include page="../templates/header.jsp">
		<jsp:param value="ver" name="pagina"/>
	</jsp:include>
		
		<div class="columns is-centered">
			<div class="column is-10">
				<table class="table is-hovered is-bordered is-fullwidth">
					<thead class="has-background-warning">
						<tr>
							<th>Nro</th>
							<th>Nombre</th>
							<th>Nivel</th>
							<th>Tipo</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${pokemones}" var="p"> 
							<tr>
								<td>${p.numero}</td>
								<td>${p.nombre}</td>
								<td class="${p.nivel >50? 'has-text-danger': 'has-text-info' }">${p.nivel}</td>
								<td>
									<i class='${p.tipo.icono} ${p.tipo.color} fa-2x'></i>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	
	</main>
</body>
</html>