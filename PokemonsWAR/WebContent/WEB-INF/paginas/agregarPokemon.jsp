<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../templates/header.jsp">
	<jsp:param value="agregar" name="pagina" />
</jsp:include>

<div class="columns is-centered">
	<div class="column is-7">
		<form method="POST" action="AgregarPokemonesController.do">
			<div class="card">
				<div class="card-header has-background-warning">
					<span class="card-header-title">Registrar Pokemon</span>
				</div>
				<div class="card-content">
					<div class="field">
						<label class="label" for="nombre-txt">Nombre</label>
						<div class="control">
							<input type="text" placeholder="Ingrese nombre" required
								name="nombre-txt" class="input" />
						</div>
					</div>
					<div class="field">
						<label class="label" for="nivel-txt">Nivel</label>
						<div class="control">
							<input type="number" required min="1" max="100" name="nivel-txt"
								class="input" />
						</div>
					</div>
					<div class="field">
						<label class="label" for="desc-txt">Descripción</label>
						<div class="control">
							<textarea name="desc-txt" class="textarea"></textarea>
						</div>
					</div>
					<div class="field">
						<label class="label" for="tipo-select">Tipo</label>
						<div class="control">
							<div class="select">
								<select name="tipo-select">
									<c:forEach items="${tipos }" var="t" >
										<option value="${t.codigo}">${t.nombre}</option>
									</c:forEach>
								</select>
							</div>
						</div>
					</div>
				</div>
				<div class="card-footer">
					<button class="button is-primary" type="submit">Agregar</button>
				</div>

			</div>
		</form>
	</div>
</div>
</main>
</body>
</html>