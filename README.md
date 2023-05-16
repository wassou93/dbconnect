# DBConnect Java Application

This Java application, called **dbconnect**, demonstrates the connection to a MariaDB database and performs CRUD operations on the **Personne** table.

## Prerequisites

Before running the application, ensure that you have the following prerequisites installed:

- Java Development Kit (JDK)
- MariaDB Database Server

## Setup

1. Clone the repository:
   ```shell
   git clone <repository_url>
   
2. Open the project in your preferred Java IDE.

3. Modify the database connection details in the `edu.dbconnect.services.PersonneCrud` class. Update the connection URL, username, and password to match your MariaDB database configuration.

## Usage

1. Compile and run the `Main` class to execute the application.

2. The application performs the following operations:

- Creates `Personne` objects and adds them to the `personne` table.
- Retrieves all records from the `personne` table and displays them in the console.

Feel free to modify the code in the `Main` class to suit your requirements.

## Note

Make sure to replace `<repository_url>` with the actual URL of your Git repository. Feel free to customize the content further based on your specific needs.

## License

This project is licensed under the [MIT License](LICENSE.md).


