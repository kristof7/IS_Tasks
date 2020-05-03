
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta name="description" content="E-learning web app" />
    <title>E-learning web app by Dream Team</title>
    <link
            rel="stylesheet"
            href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
            integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
            crossorigin="anonymous"
    />
    <link href="styles.css" rel="stylesheet" />
</head>
<body>
<jsp:include page="head-and-navbar.jsp"/>
<main role="main">
    <div class="container">
        <form method="get" action="/find-book" class="contact-from">
            <div class="form">
                <label for="author">author:</label>
                <input type="text" name="author" id="author"  />
            </div>
            <div class="form">
                <button type="submit">
                    search
                </button>
            </div>
        </form>
        <form method="get" action="/find-book" class="contact-from">
            <div class="form">
                <label for="tittle">title:</label>
                <input type="tittle" name="tittle" id="tittle"  />
            </div>
            <div class="form">
                <button type="submit">
                    search
                </button>
            </div>
        </form>
    </div>
</main>
<script
        src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"
></script>

<script
        src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"
></script>

<script
        src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"
></script>
</body>
</html>
