# Java HTML DSL
An HTML DSL for Java that simplifies creation of correcly formated HTML based text.
This DSL supports extra HTML features such as header centering, specifying which font to use on the page and simplified table creation by using HtmlTableBuilder.

## Usage examples
Examples of usage are available in the tests, but here's a pretty basic one:
```java
String htmltext = html(
                        head(
                                title("Homepage")
                        ),
                        body("Verdana",
                                h1("Welcome to the homepage of our website!"),
                                hr(),
                                a("/time", "View Current Time"),
                                br()
                                a("/users", "View Existing Users"),
                                br()
                                a("/rooms/search", "Search for Rooms"),
                                br()
                                a("/labels", "View Existing Labels"),
                        )
                    ).toString();
```
Which outputs:
```html
<html>
	<head><meta name="viewport" content="width=device-width, initial-scale=1.0"> 
		<title>Homepage</title>
	</head>
	<body style="font-family: Verdana">
		<h1 style=text-align:center>Welcome to the homepage of our website!</h1>
		<hr>
		
		<a href=/time>View Current Time</a>
		<br>
		
		<a href=/users>View Existing Users</a>
		<br>
		
		<a href=/rooms/search>Search for Rooms</a>
		<br>
		
		<a href=/labels>View Existing Labels</a>
	</body>
</html>
```
NOTE: The `viewport` meta tag is added by default to fix scaling issues.

And here's another one, which specified a label's creation via a form:
```java
String htmltext = html(
                        head(
                                title("Label Creation")
                        ),
                        body(HTML_DEFAULT_FONT,
                                a("/", "Home"), a("/labels", "View Existing Labels"),
                                h1("Create a Label"),
                                form("post", "/labels/create",
                                        div(
                                                label("name", "Enter name: "),
                                                input(TEXT,
                                                        attrib("name", "name"),
                                                        attrib("id", "name"),
                                                        attrib("placeholder", "Name"),
                                                        attrib("required", "true"),
                                                        attrib("maxlength", "30")
                                                )
                                        ),
                                        input(SUBMIT, attrib("name","submit"), attrib("value","Create"))
                                )
                        )
                    ).toString();
```
Which outputs:
```html
<!DOCTYPE html>
<html>
	<head><meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Label Creation</title>
	</head>
	<body style="font-family: Verdana">
		<a href=/>Home</a>
		<a href=/labels>View Existing Labels</a>
		<h1>Create a Label</h1>
		<form method="post" action="/labels/create">
			<div>
				<label for="name">Enter name: </label>
				<input type="text" name="name" id="name" placeholder="Name" required="true" maxlength="30" />
				<p style="color:red;font-size:70.0%;"></p>
			</div>
			<input type="submit" name="submit" value="Create" />
		</form>
	</body>
</html>
```

## Credits
This DSL was created by:
* [PTKickass](https://github.com/PTKickass)
* [TiagoMMDavid](https://github.com/TiagoMMDavid)
* [dvsshadow](https://github.com/dvsshadow)