<h1>Hello</h1>

<form action="/invoice" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    <label> Name : <input> </label>
    <button type="submit"> Add</button>
</form>